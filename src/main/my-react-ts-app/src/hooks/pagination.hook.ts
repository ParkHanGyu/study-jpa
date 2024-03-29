import { useEffect, useState } from "react";

const usePagination = <T>(countPerPage: number ) => {
  //  state: 전체 객체 리스트 상태   //
  const [totalList, setTotalList] = useState<T[]>([]);

  //  state: 보여줄 객체 리스트 상태  //
  // 한개의 페이지에서 보여줄 객체
  const [viewList, setViewList] = useState<T[]>([]);

  //  state: 현재 페이지 번호 상태   //
  // 지금 몇번째 페이지에 있는지에 대한걸 저장할 상태
  const [currentPage, setCurrentPage] = useState<number>(1);

  //  state: 전체 페이지 번호 리스트 상태   //
  // 우리가 몇번 페이지 까지 있는지
  const [totalPageList, setTotalPageList] = useState<number[]>([1]);

  //  state: 보여줄 페이지 번호 리스트 상태   //
  const [viewPageList, setViewPageList] = useState<number[]>([1]);

  //  state: 현재 섹션 상태   //
  const [currentSection, setCurrentSection] = useState<number>(1);

  //  state: 전체 섹션 상태   //
  const [totalSection, setTotalSection] = useState<number>(1);

  //   effect: totalList가 변경될 때마다 실행할 작업   //
  useEffect(() => {
    const totalPage = 
  },[totalList] )

  return {
    // 현재 페이지가 어떤 페이지에 있는지
    currentPage,
    setCurrentPage,
    currentSection,
    // 화살표를 누르면 섹션이 바뀌게 만들 예정
    setCurrentSection,
    viewList,
    viewPageList,
    // 현재 섹션과 마지막 섹션이 같으면 동작하지 못하게 만들 예정이기 때문에 필요
    totalSection,
    setTotalList,
  };
};

export default usePagination;

// https://www.youtube.com/watch?v=zVwqr7mwQc8
// 16:31부터