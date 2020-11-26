function greeting(){
    console.log("Hej");
}

function preventFormFromSending(searchform){
    searchform.submit(function (event){
        event.preventDefault(); // forhindrer at formen bliver sendt.
        searchUser($("#username").val());// hent value fra <input...>
    });
}

function preventNyhedsFormFromSending(searchform){
    searchform.submit(function (event){
        event.preventDefault(); // forhindrer at formen bliver sendt.
        hentNyheder();
    });
}

function preventCreateNyhedFormFromSending(searchform){
    searchform.submit(function (event){
        event.preventDefault(); // forhindrer at formen bliver sendt.
        opretNyhed($("#nyhed").val());
    });
}

function opretNyhed(nyhed) {
console.log("opret er trykket " + nyhed)


    var createObject = {};
    createObject["nyheden"] = nyhed;

    $.ajax(
        {
            url: "api/opretnyheder",
            type: "POST",
            contentType: "application/JSON",
            data: JSON.stringify(createObject),
            success:function(data) {

                // $.each(data.nyheder, function (index, value) {
                //     $("#nyheder").append("<div>" + value.nyheden + "<button>Dislike</button></div>");
                // });

                $("#nyheder").append("<div>" + data.nyheder.pop().nyheden + "<button>Dislike</button></div>");
                $("#statusOpretnyhed").html("Server: Nyheder OK");
            },
            error:function (data) {
                $("#statusOpretnyhed").html("Server: Nyheder ERROR");

            }
        }
    );
}




function hentNyheder(){ // AJAX request
    console.log("hent nyheder er kaldet ");

    $.ajax({
            url:"/api/nyheder",
            type:"POST",
            contentType:"application/JSON",
            success:function (data){

                $.each(data.nyheder, function (index, value) {
                    $("#nyheder").append("<div>" + value.nyheden + "<button>Dislike</button></div>")

                })
                $("#status").html("Server: Nyheder OK");
            },
            error:function (data){
                console.log("ERROR i svar fra server");
                $("#status").html("ERROR i svar fra server");
            }
        });
}




function checkjQuery(){
    if(typeof jQuery != undefined){
        console.log("jQuery er loaded")
    }else {
        console.log("jQuery er IKKE loaded")
    }
}