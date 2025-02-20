-- 코드를 입력하세요
SELECT user_id, product_id
FROM ONLINE_SALE
GROUP BY user_id, product_id --group by: 중복제거
HAVING COUNT(*) > 1 --user_id, product_id가 2개 이상인 경우
ORDER BY user_id, product_id DESC
