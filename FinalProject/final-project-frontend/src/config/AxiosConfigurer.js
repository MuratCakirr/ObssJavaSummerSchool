import axios from "axios";
import LocalStorageUtil from "../util/LocalStrorageUtil";

const AxiosCongiurer = (function () {
  const _configure = () => {
    axios.interceptors.request.use(
      (config) => {
        const token = LocalStorageUtil.getToken();
        if (token) {
          config.headers["Authorization"] = "Bearer " + token;
        }
        return config;
      },
      (error) => {
        Promise.reject(error);
      }
    );
  };

  return {
    configure: _configure
  };
})();

export default AxiosCongiurer;
