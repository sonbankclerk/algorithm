-- 코드를 입력하세요
SELECT member_id, member_name, gender, TO_CHAR(date_of_birth, 'YYYY-MM-DD') date_of_birth
FROM member_profile
WHERE gender = 'W'
AND tlno is not null
AND TO_CHAR(date_of_birth, 'MM') = 3 
ORDER BY member_id