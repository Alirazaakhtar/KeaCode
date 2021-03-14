function testjQuery() {
    if (jQuery() != undefined) {
        console.log("Working jQuery")
    } else {
        console.log("jQuery not working")
    }
}


function preventCreate(create) {
    create.submit(function (event) {
        event.preventDefault();
        console.log("prevent working")
        createStudent($("#name").val(), $("#email").val(), $("#supervisor_id").val());
    })
}


function createStudent(name, email, supervisor_id) {

    //Først opretter jeg et objekt til supervisor, hvor jeg efterfølgende sætter det ind i den anden obejkt
    var obj2 = {};
    obj2["id"] = supervisor_id;

    var obj1 = {};
    obj1["name"] = name;
    obj1["email"] = email;
    obj1["supervisor"] = obj2;



    $.ajax({
        url: "/api/create",
        type: "POST",
        contentType: "Application/JSON",
        data: JSON.stringify(obj1),
        success: function (data) {
            console.log("submit clicked create student");
            $("#p").html("Created");
        },
        error: function (data) {
            console.log("Submit not working");
        }
    });
}



