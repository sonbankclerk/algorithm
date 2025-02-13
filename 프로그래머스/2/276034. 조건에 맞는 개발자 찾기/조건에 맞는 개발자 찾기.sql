-- 코드를 작성해주세요
SELECT DISTINCT(b.ID), b.EMAIL, B.FIRST_NAME, b.LAST_NAME
FROM SKILLCODES a, DEVELOPERS b
WHERE a.name in ('C#', 'PYTHON')
AND b.skill_code & a.code = a.code
ORDER BY b.ID