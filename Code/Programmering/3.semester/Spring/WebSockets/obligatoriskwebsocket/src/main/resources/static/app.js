var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#greetings").html("");  // clears the greetings
}

function connect() {
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/greetings', function (greeting) {
            // var col = JSON.parse(greeting.body).col;
            // var row = JSON.parse(greeting.body).row;
            var input = JSON.parse(greeting.body).content;
            //
            updateGame(input);
        });
    });
}


var isItRed = true;

var num1 = 43;
var num2 = 44;
var num3 = 45;
var num4 = 46;
var num5 = 47;
var num6 = 48;
var num7 = 49;

function updateGame(tal){

    var v_color, v_text;
    if(isItRed) {
        v_color = "red";
        v_text = "Blacks turn";
    }
    else {
        v_color = "black";
        v_text = "Red turn";
    }
    isItRed = !isItRed;

    var numX;
    switch (tal) {
        case "1":
            numX = num1 = num1 - 7;
            break;
        case "2":
            numX = num2 = num2 - 7;
            break;
        case "3":
            numX = num3 = num3 - 7;
            break;
        case "4":
            numX = num4 = num4 - 7;
            break;
        case "5":
            numX = num5 = num5 - 7;
            break;
        case "6":
            numX = num6 = num6 - 7;
            break;
        case "7":
            numX = num7 = num7 - 7;
            break;
        default:
            console.log ("error happened in switch for tal!");
            break;
    }
    $("#" + (numX)).addClass(v_color);
    $("#turn").html("<h2>" +  v_text + "</h2>");
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName(num) {
    stompClient.send("/app/hello", {}, JSON.stringify({'name': num}));
    console.log("clicked" + num);
}

// function sendName(col, row) {
//     stompClient.send("/app/hello", {}, JSON.stringify({'col': col}));
//     stompClient.send("/app/hello", {}, JSON.stringify({'row': row}));
// }



$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#send" ).click(function() { sendName(); });
});