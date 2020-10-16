function greeting() {
    console.log("Hej");
}


function preventDefault(searchform) {

    // når man trykker på submit, så kører det kode inden i
    searchform.submit(function (event) {
        event.preventDefault(); // forhindre at formen bliver sendt
        searchUser($("#username").val()); // hent value fra input
        console.log("submit er trykket")
    });
}


function searchUser(userName) {
    console.log("SearchUser er kaldet med " + userName);

// Ajax request

    var searchObject = {};
    searchObject["username"] = userName;

    $.ajax(
        {
            url:"/api/search",
            type:"POST",
            contentType: "application/JSON",
            data: JSON.stringify(searchObject),
            success:function (data) {
                console.log("SUCCES svar fra server");
                $("#status").html(data.message);
            },
            error:function (data) {
            console.log("Error i svar fra server")
            }
        }
    );
}


function checkJQuery() {
    if (typeof jQuery != "undefined") {
        console.log("JQuery er loaded")
    } else {
        console.log("JQuery er ikke loaded")
    }
}