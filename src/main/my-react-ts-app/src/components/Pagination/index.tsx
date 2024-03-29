import React, { useState } from "react";

const PaginationExample = () => {
  // 가상의 데이터 배열
  const [data, setData] = useState<string[]>(
    Array.from({ length: 100 }, (_, i) => `Item ${i + 1}`)
  );

  // 현재 페이지 번호를 나타내는 상태 변수
  const [currentPage, setCurrentPage] = useState<number>(1);
  // 한 페이지당 표시될 아이템의 수
  const itemsPerPage = 10;

  // 현재 페이지의 첫 번째와 마지막 아이템의 인덱스를 계산하는 변수
  const indexOfLastItem = currentPage * itemsPerPage;
  const indexOfFirstItem = indexOfLastItem - itemsPerPage;

  //현재 페이지에 표시될 아이템들의 배열
  //data 배열에서 indexOfFirstItem부터 indexOfLastItem까지의 아이템을 추출하여 구성
  const currentItems = data.slice(indexOfFirstItem, indexOfLastItem);

  // 페이지 번호를 클릭할 때 실행되는 함수
  // 선택한 페이지 번호를 인자로 받아 현재 페이지 상태(currentPage)를 업데이트
  const handleClick = (pageNumber: number) => {
    setCurrentPage(pageNumber);
  };

  return (
    <div>
      {/* 현재 페이지의 아이템들을 보여주는 부분 */}
      <ul>
        {currentItems.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>

      {/* 페이지 번호 목록 */}
      <div>
        {Array.from(
          { length: Math.ceil(data.length / itemsPerPage) },
          (_, i) => i + 1
        ).map((pageNumber) => (
          <button key={pageNumber} onClick={() => handleClick(pageNumber)}>
            {pageNumber}
          </button>
        ))}
      </div>
    </div>
  );
};

export default PaginationExample;
