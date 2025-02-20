-- 코드를 작성해주세요
SELECT id,
    CASE
        WHEN sizeRank = 1 THEN 'CRITICAL'
        WHEN sizeRanK = 2 THEN 'HIGH'
        WHEN sizeRank = 3 THEN 'MEDIUM'
        WHEN sizeRank = 4 THEN 'LOW'
    END AS colony_name
FROM (
    SELECT id, size_of_colony, NTILE(4) OVER (ORDER BY size_of_colony DESC) AS sizeRank
    FROM ecoli_data
) AS rankedColony
ORDER BY id;