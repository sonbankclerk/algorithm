-- 코드를 입력하세요
/*SELECT B.BOOK_ID, A.AUTHOR_NAME, TO_CHAR(B.PUBLISHED_DATE, 'YYYY-MM-DD') PUBLISHED_DATE
FROM BOOK B, AUTHOR A
WHERE B.AUTHOR_ID = A.AUTHOR_ID
AND B.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE */

SELECT a.book_id, b.author_name, TO_CHAR(a.published_date, 'YYYY-MM-DD') published_date
FROM book a, author b
WHERE a.author_id = b.author_id
AND a.category = '경제'
ORDER BY published_date













