function greeting() {
    console.log("Hej");
}


function check() {

    if (jQuery != undefined) {
        console.log("jQuery connected")
    } else {
        console.log("jQuery not connected")
    }

}

function prevent(add) {
    add.submit(function (event) {
        event.preventDefault(); // forhinder at formen bliver sendt
        addUser($("#newUsername").val());
        console.log("submit trykket for ned user");

    })
}


function addUser(newUsername) {

    var user = {};
    user["username"] = newUsername;


    $.ajax({
        url: "/add",
        type: "POST",
        contentType: "application/JSON",
        data: JSON.stringify(user),
        success: function (data) {
            $("#added").append(data.list.pop().username);
            console.log("Success");
        },
        error: function (data) {
console.log("Error");
        }
    });
}


function preventDefault(searchForm) {

    searchForm.submit(function (event) {
        event.preventDefault(); // forhindre at formen bliver sendt
        getsearch($("#username").val());
        console.log("Submit er trykket")
    })
}


function getsearch(username) {


    var user = {};
    user["username"] = username;

    $.ajax(
        {
            url: "/search",
            type: "POST",
            contentType: "application/JSON",
            data: JSON.stringify(user),
            success: function (data) {
                $("#total").html(data.totalSearch);


                getUsers();

                // $.each(data.nyheder, function (index, value) {
                //     $("#nyheder").append("<div>" + value.nyheden + "<button>Dislike</button></div>");
                // });
                console.log("Success");
            },
            error: function (data) {
                console.log("Error");
            }
        }
    );

}


function getUsers() {

    $.ajax({
       url: "/get",
        type: "POST",
        contentType: "application/JSON",
        success: function (data) {

           $.each(data.list, function (index, value) {
            $("#list").append("<div>" + value.username + "</div>");
           })
        }

    });
}