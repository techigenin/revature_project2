window.onload = function (){
    document.getElementById("submitButton").addEventListener("click", submitMethod);
}

function submitMethod () {
    let uName = document.getElementById("username").value;
    let pWord = document.getElementById("password").value;

    let user = {
        username: uName,
        password: pWord
    };

   let xhr = new XMLHttpRequest();

   xhr.onreadystatechange = function() {
       if (xhr.readyState == 4 && xhr.status === 200){
           console.log(xhr.responseText);
            if (xhr.responseText === 'true') {
                getDetails();
            }
        }
    }


   xhr.open("POST", "http://127.0.0.1:8080/festivalApp/login", true);

   let string = JSON.stringify(user);

   xhr.send(string);
}

function getDetails () {
    let xhr = new XMLHttpRequest();

    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            console.log(xhr.responseText);
        }
    }

    xhr.open("GET","http://127.0.0.1:8080/festivalApp/details", true);

    xhr.send();
}