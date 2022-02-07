var trys = 0;
var buk;
var cow;
var myCharsArray;
var win = false;
var arrayResults = [];
var randomString;
var randomCharsArray;
var result_display;

var result           = '';
var characters       = '0123456789';
var charactersLength = characters.length;
for ( var i = 0; i < 4; i++ ) {
    result += characters.charAt(Math.floor(Math.random() * charactersLength));
}
randomString = result;
document.write(randomString + " expect");
randomCharsArray = randomString.split('');

function chekNumb(stringLine) {

    trys++;
    buk = 0;
    cow = 0;
    myCharsArray = stringLine.split('');

    for (i = 0; i < 4; i++) {
        if (myCharsArray[i] == randomCharsArray[i]) {
            buk++;
        }
        for (j = 0; j < 4; j++) {
            if (myCharsArray[i] == randomCharsArray[j]) {
                cow++;
                break;
            }
        }
    }
    arrayResults.push("B" + buk + "C" + cow);
    if (stringLine == randomString) {
        win = true;
        arrayResults.push("you win. Your trys: " + trys);

    } else {
        arrayResults.push(" No, get some try. Your trys: " + trys + '<br>');
    }
}

var inputIn = document.querySelector('.input-in');
var button = document.querySelector('button');

button.onclick = function() {
    console.log(inputIn.value.toString);
    chekNumb(inputIn.value);
    result_display = document.getElementById('answer');
    result_display.innerHTML = '<h2>' + arrayResults + '</h2>';
    console.log(inputIn.value);
}
