-- 코드를 입력하세요
SELECT 
    DR_NAME, 
    DR_ID, 
    MCDP_CD, 
    DATE_FORMAT(hire_ymd, '%Y-%m-%d') HIRE_YMD
FROM doctor
WHERE
    mcdp_cd in ('CS', 'GS')
ORDER BY 
    hire_ymd DESC,
    dr_name