let second_doc = document.getElementById("second");
let minute_doc = document.getElementById("minute");
let hour_doc = document.getElementById("hour");

window.setInterval(()=> {
    let time = new Date();
    let second = time.getSeconds(), minute = time.getMinutes(), hour = time.getHours(), milliseconds = time.getMilliseconds();
    if(hour > 12){
        hour - 12
    }
    minute_doc.style.transform = `rotate(${(minute * 6) + (second / 10)}deg)`;
    minute_doc.style.display = 'block';
    second_doc.style.transform = `rotate(${(second * 6) + ((milliseconds * 3) / 500)}deg)`;
    second_doc.style.display = 'block';
    hour_doc.style.transform = `rotate(${((hour * 30) + (minute / 2) + (second /120))}deg)`;
    hour_doc.style.display = 'block';
}, 10)
