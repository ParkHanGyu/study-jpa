import axios from "axios";
import { GetUserListResponseDto } from "./respons/user";
import ResponseDto from "./respons/response.dto";
import { UserList } from "../types/interface";

const DOMAIN = "http://localhost:8080";
const API_DOMAIN = `${DOMAIN}/api`;

// 회원 리스트 요청
const USER_LIST_URL = () => `${API_DOMAIN}/users`;
export const getUserList = async () => {
  const result = await axios
    .get(USER_LIST_URL())
    .then((response) => {
      const responseBody: UserList[] = response.data;
      return responseBody;
    })
    .catch((error) => {
      if (!error.response.data) return null;
      return error.response.data;
    });
  return result;
};

// ============================================================================
