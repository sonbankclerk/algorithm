-- 코드를 입력하세요
SELECT *
FROM 
    (SELECT name
     FROM animal_ins
     ORDER BY datetime
     )
WHERE ROWNUM = 1


