-- 코드를 입력하세요
/*
SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS A, ANIMAL_OUTS B
WHERE A.ANIMAL_ID = B.ANIMAL_ID
AND A.DATETIME > B.DATETIME
ORDER BY A.DATETIME */

select a.animal_id, a.name
from animal_ins a, animal_outs b
where a.animal_id = b.animal_id
and a.datetime > b.datetime
order by a.datetime