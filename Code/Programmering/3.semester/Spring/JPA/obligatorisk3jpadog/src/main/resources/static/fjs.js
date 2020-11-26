function preventOwner(createform){
    createform.submit(function (e) {
        e.preventDefault();
        createOwner($("#ownerName").val());
    });
}

function preventDog(createform){
    createform.submit(function (e) {
        e.preventDefault();
        createDog($("#dogName").val(), $("#img").val());
    });
}


function test() {
console.log("Hello wolrd");
}

function testJ() {
if(jQuery =! undefined){
    console.log("Jquery working");
}
else{
    console.log("Not working");
}
}


function createOwner(name) {

    var obj = {};
    obj["name"] = name;

    $.ajax({
        url: "createowner",
        type: "POST",
        contentType: "Application/JSON",
        data: JSON.stringify(obj),
        success: function (data) {
                  console.log("created owner");
        },
        error: function (data) {
                              console.log("ERROR owner creating");
        }
    });

}



function createDog(name, img) {

    var obj = {};
    obj["name"] = name;
    obj["img"] = img;

    $.ajax({
        url: "/createdog",
        type: "POST",
        contentType: "Application/JSON",
        data: JSON.stringify(obj),
        success: function (data) {
            console.log("created dog");
        },
        error: function (data) {
            console.log("ERROR dog creating");
        }
    });

}