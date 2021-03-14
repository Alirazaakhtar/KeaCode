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
        getAllStudents();
    })
}

function preventDelete(deleteform) {
    deleteform.submit(function (event) {
        event.preventDefault();
        deleteStudent($("#delete_id").val());
    })
}

function preventUpdate(updateform) {
    updateform.submit(function (event) {
        event.preventDefault();
        updateStudent($("#update_id").val(), $("#update_name").val(), $("#update_email").val(), $("#update_supervisor").val());
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
            $("#p").append("Created");
        },
        error: function (data) {
            console.log("Submit not working");
        }
    });
}

function getAllStudents() {


    $("#row").empty();



    $.ajax({
        url: "/api/getAllStudents",
        type: "POST",
        contentType: "Application/JSON",
        success: function (data) {
            $.each(data.studentList, function (index, value) {
                // på disse id indsætter vi data fra listen
                $("#tableName").append("<h5>" + value.name + " </h5>");
                $("#tableEmail").append("<h5>" + value.email + " </h5>");
                $("#tableSupervisor").append("<h5>" + value.supervisor.name + " </h5>");
            })
        },
        error: function (data) {
            console.log("get All students failed");
        }
    });

}


function deleteStudent(id) {

    var obj1 = {};
    obj1["id"] = id;

    $.ajax({
        url: "/api/delete",
        type: "POST",
        contentType: "Application/JSON",
        data: JSON.stringify(obj1),
        success: function (data) {
            console.log("delete working");
            $("#o").html("Deleted");

        },
        error: function (data) {
            console.log("delete not working");
        }
    });


}


function updateStudent(id, name, email, supervisor_id) {

    var obj2 = {};
    obj2["id"] = supervisor_id;

    var obj1 = {};
    obj1["id"] = id;
    obj1["name"] = name;
    obj1["email"] = email;
    obj1["supervisor"] = obj2;


    $.ajax({
        url: "/api/update",
        type: "POST",
        contentType: "Application/JSON",
        data: JSON.stringify(obj1),
        success: function (data) {
            console.log("update working");
            $("#u").html("Saved");

        },
        error: function (data) {
            console.log("update not working");
        }
    });


}



