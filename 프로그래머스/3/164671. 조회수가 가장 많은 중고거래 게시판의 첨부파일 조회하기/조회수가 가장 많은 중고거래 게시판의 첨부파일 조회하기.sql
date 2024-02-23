-- 코드를 입력하세요
select
    '/home/grep/src/' || BOARD_ID || '/' ||FILE_ID || FILE_NAME || FILE_EXT as "FILE_PATH"
from
    USED_GOODS_FILE
where 
    BOARD_ID = 
        (SELECT 
            BOARD_ID
        FROM 
            USED_GOODS_BOARD
        where 
            views = (select max(views) from USED_GOODS_BOARD)
        )
order by
    FILE_ID desc