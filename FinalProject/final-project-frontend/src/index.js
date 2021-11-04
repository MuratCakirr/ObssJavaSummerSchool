import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './pages/App';
import AxiosConfigurer from "./config/AxiosConfigurer";

AxiosConfigurer.configure();

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);


