import React, { useState, useEffect } from "react";
import "./Style.css";
import Weathercard from "./Weathercard";


function Temp() {
  const [searchValue, setsearchValue] = useState("Pune");
  const [tempState, settempState] = useState({});

  const getWeather = async () => {
    try {
      let url = `https://api.openweathermap.org/data/2.5/weather?q=${searchValue}&units=metric&appid=9bad6cf6d2e10e17ca8643f85a9a431b`;

      const res = await fetch(url);
      const data = await res.json();
      console.log(data.weather)
      // here we have used destructuring here
      const { temp, humidity, pressure } = data.main;
      const { main: weathermood } = data.weather[0];
      const { name } = data;
      const { speed } = data.wind;
      const { country, sunset } = data.sys;

      const myNewweather = {
        temp,
        humidity,
        pressure,
        weathermood,
        name,
        speed,
        country,
        sunset,
      };

      settempState(myNewweather);

    } catch (error) {
      window.alert(error);
    }
  };

  useEffect(() => {
    getWeather();
  }, []);

  return (
    <>
      <div className="wrap">
        <div className="search">
          <input
            type="search"
            placeholder="search..."
            id="search"
            autoFocus
            className="searchTerm"
            value={searchValue}
            onChange={(e) => setsearchValue(e.target.value)}
          />

          <button className="searchButton" type="button" onClick={getWeather}>
            Search
          </button>
        </div>
      </div>
      <Weathercard tempState={tempState}></Weathercard>
    </>
  );
}

export default Temp;
