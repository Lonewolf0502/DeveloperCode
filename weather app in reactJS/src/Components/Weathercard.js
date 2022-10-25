import React,{useState, useEffect} from 'react'

function Weathercard(props) {
const [weatherIcon, setweatherIcon] = useState("")
    const {
        temp,
        humidity,
        pressure,
        weathermood,
        name,
        speed,
        country,
        sunset,
    } = props.tempState 

    useEffect(() => {

         //......changing weather icon using If switch case.....
      
        // if(weathermood){
        //     switch (weathermood) {
        //         case "Clouds":
        //   setweatherIcon("wi-day-cloudy");
        //   break;
        // case "Haze":
        //   setweatherIcon("wi-fog");
        //   break;
        // case "Clear":
        //   setweatherIcon("wi-day-sunny");
        //   break;
        // case "Mist":
        //   setweatherIcon("wi-dust");
        //   break;

        // default:
        //   setweatherIcon("wi-day-sunny");
        //   break;
        //     }
        // }


        //......changing weather icon using If else ladder.....

        if (weathermood === "Haze") {
            setweatherIcon("wi-fog")
        }

        else if(weathermood === "Mist"){
            setweatherIcon("wi-dust") 
        }

        else if(weathermood === "Clear"){
            setweatherIcon("wi-day-sunny")   
        }

        else if(weathermood === "Clouds"){
            setweatherIcon("wi-day-cloudy")
        }

        else{
            setweatherIcon("wi-day-sunny")
        }
    }, [weathermood])
    

    // converting seconds into minutes

    let sec = sunset
    let date = new Date(sec * 1000);
    let timeStr = `${date.getHours()}:${date.getMinutes()}`;
  return (
    <>

      <article className="widget">
        <div className="weatherIcon">
          <i className={`wi ${weatherIcon}`}></i>
        </div>

        <div className="weatherInfo">
          <div className="temperature">
            <span>{temp}&deg;</span>
          </div>

          <div className="description">
            <div className="weatherCondition">{weathermood}</div>
            <div className="place">{name}, {country}</div>
          </div>
        </div>
        <div className="date">{new Date().toLocaleString()}</div>

        {/*Four column section*/}

        <div className="extra-temp">
          <div className="temp-info-minmax">
            <div className="two-sided-section">
              <p>
                <i className={"wi wi-sunset"}></i>
              </p>
              <p className="extra-info-leftside">
                {timeStr} PM<br />
                Sunset
              </p>
            </div>

            <div className="two-sided-section">
              <p>
                <i className={"wi wi-humidity"}></i>
              </p>
              <p className="extra-info-leftside">
                {humidity} <br />
                Humidity
              </p>
            </div>
          </div>

          <div className="weather-extra-info">
            <div className="two-sided-section">
              <p>
                <i className={"wi wi-rain"}></i>
              </p>
              <p className="extra-info-leftside">
               {pressure} <br />
                Pressure
              </p>
            </div>

            <div className="two-sided-section">
              <p>
                <i className={"wi wi-strong-wind"}></i>
              </p>
              <p className="extra-info-leftside">
                {speed} <br />
                Speed
              </p>
            </div>
          </div>
        </div>
      </article>
    </>
  )
}

export default Weathercard