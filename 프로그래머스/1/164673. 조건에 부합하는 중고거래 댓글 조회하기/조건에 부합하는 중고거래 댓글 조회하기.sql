-- 코드를 입력하세요
SELECT a.title title, 
    a.board_id board_id, 
    b.reply_id reply_id, 
    b.writer_id writer_id, 
    b.contents contents, 
    TO_CHAR(b.created_date,'YYYY-MM-DD') created_date
FROM used_goods_board a, used_goods_reply b
WHERE a.board_id = b.board_id
AND TO_CHAR(a.created_date, 'YYYY-MM') ='2022-10' 
ORDER BY b.created_date, a.title
