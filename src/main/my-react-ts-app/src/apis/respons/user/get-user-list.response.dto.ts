import ResponseDto from "../response.dto";
import UserList from "../../../types/interface/user-list.interface";

export default interface GetUserListResponseDto extends ResponseDto {
  id: number;
  nickname: string;
  email: string;
  registerDate: string;
  admin: boolean;
  userList: UserList[];
}
