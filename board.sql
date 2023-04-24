create table board(
    num number(5) primary key,
    pnum number(5),
    pass varchar2(30),
    name varchar2(30),
    email varchar2(30),
    title varchar2(50),
    content varchar2(1000),
    readcount number(4) default 0,
    writedate date default sysdate
);
create sequence board_seq start with 1 increment by 1;
insert into board(num, pnum, name, email, pass, title, content)
values(board_seq.nextval, 0, '¼ºÀ±Á¤', 'pinksung@nate.com', '1234', 'Ã¹¹æ¹®', '¹İ°©½À´Ï´Ù.');
insert into board(num, pnum, name, email, pass, title, content)
values(board_seq.nextval, 0, '¼ºÀ±Á¤', 'pinksung@nate.com', '1234', '±è¹ä', '¸ÀÀÖ¾î¿ä.');
insert into board(num, pnum, name, email, pass, title, content)
values(board_seq.nextval, 2, 'Àü¼öºó', 'raccon@nate.com', '1234', 'ÁøÂ¥·Î?', '¸ÀÀÖ¾ú´Ù´Ï ÁÁ¾Ò°Ú³×¿ä.');
insert into board(num, pnum, name, email, pass, title, content)
values(board_seq.nextval, 3, '¼ºÀ±Á¤', 'pinksung@nate.com', '1234', '³×', '³Ê¹« ÁÁ¾Ò¾î¿ä');
insert into board(num, pnum, name, email, pass, title, content)
values(board_seq.nextval, 0, 'Àü¿øÁö', 'one@nate.com', '1234', '°¹°ñ¸¶À»', 'µÅÁö»ï°ã»ìÀÌ ¸ÀÀÖ¾î¿ä!');
select * from board;
select level, num, pnum, pass, name, email, LPAD(' ', 4*(level-1))||title title, content, readcount, writedate
from board start with pnum=0 connect by prior num=pnum order siblings by num desc;
commit;