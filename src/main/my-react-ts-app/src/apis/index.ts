import axios from "axios";
import { GetUserListResponseDto } from "./respons/user";
import ResponseDto from "./respons/response.dto";

const DOMAIN = "http://localhost:8080";
const API_DOMAIN = `${DOMAIN}/api`;

const USER_LIST_URL = () => `${API_DOMAIN}/users`;

export const getUserList = async () => {
  const result = await axios
    .get(USER_LIST_URL())
    .then((response) => {
      const responseBody: GetUserListResponseDto = response.data;
      return responseBody;
    })
    .catch((error) => {
      if (!error.response.data) return null;
      const responseBody: ResponseDto = error.response.data;
      return responseBody;
    });
  return result;
};

// ============================================================================
