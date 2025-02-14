-- 코드를 작성해주세요
SELECT 
    child.id, 
    child.genotype, 
    parent.genotype as parent_genotype
FROM 
    ecoli_data as child
LEFT JOIN 
    ecoli_data as parent
ON 
    child.parent_id = parent.id
WHERE
    (child.genotype & parent.genotype) = parent.genotype
ORDER BY child.id