-- 코드를 입력하세요
SELECT pt_name, pt_no, gend_cd, age, NVL(tlno, 'NONE') tlno
FROM patient
WHERE gend_cd = 'W'
AND age <= 12
ORDER BY age DESC, pt_name 