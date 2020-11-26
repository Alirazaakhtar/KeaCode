function greeting() {
    console.log("Working")
}

function greeting2() {
    console.log("Working2")
}


function checkJ() {
if(jQuery != undefined){
    console.log("jQuery ok")
}
else console.log("jQuery error")
}


function preventSub(createForm) {
    createForm.submit(function (event) {
        event.preventDefault();
        createCars($("#name").val(), $("#model").val());

    })
}



function createCars(name, model) {



    var cars = {};
    cars ["name"] = name;
    cars["model"] = model;


    $.ajax({
        url: "/create",
        type: "POST",
        contentType: "Application/JSON",
        data: JSON.stringify(cars),
        success: function (data) {
            console.log("Success submit trykket");
        },
        error: function (data) {
            console.log("Error");
        }
    });



}



function getCars() {

    console.log("Getcars called");

    $("td").empty();

    $.ajax({
        url: "/get",
        type: "POST",
        contentType: "Application/JSON",
        success: function (data) {
            $.each(data.carList, function (index, value) {
            $("#td").append("<p>" + value.name + "</p>");
            });
        },
        error: function (data) {
        console.log("ERROR");
        }
    });

}


