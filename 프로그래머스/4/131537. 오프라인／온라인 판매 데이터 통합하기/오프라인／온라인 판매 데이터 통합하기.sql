-- 코드를 입력하세요

/*SELECT TO_CHAR(A.SALES_DATE, 'YYYY-MM-DD'), A.PRODUCT_ID, A.USER_ID, A.SALES_AMOUNT
FROM
(SELECT USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE
    FROM ONLINE_SALE
    WHERE TO_CHAR(SALES_DATE, 'MM') = '03'

    UNION

    SELECT NULL AS USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE
    FROM OFFLINE_SALE
    WHERE TO_CHAR(SALES_DATE, 'MM') = '03') A
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID*/

SELECT TO_CHAR(sales_date, 'YYYY-MM-DD') AS sales_date, product_id, user_id, sales_amount
FROM online_sale
WHERE TO_CHAR(sales_date, 'YYYY-MM') = '2022-03'

UNION

SELECT TO_CHAR(sales_date, 'YYYY-MM-DD') AS sales_date, product_id, NULL as user_id, sales_amount
FROM offline_sale
WHERE TO_CHAR(sales_date, 'YYYY-MM') = '2022-03'
ORDER BY sales_date, product_id, user_id;












