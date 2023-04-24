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
values(board_seq.nextval, 0, '������', 'pinksung@nate.com', '1234', 'ù�湮', '�ݰ����ϴ�.');
insert into board(num, pnum, name, email, pass, title, content)
values(board_seq.nextval, 0, '������', 'pinksung@nate.com', '1234', '���', '���־��.');
insert into board(num, pnum, name, email, pass, title, content)
values(board_seq.nextval, 2, '������', 'raccon@nate.com', '1234', '��¥��?', '���־��ٴ� ���Ұڳ׿�.');
insert into board(num, pnum, name, email, pass, title, content)
values(board_seq.nextval, 3, '������', 'pinksung@nate.com', '1234', '��', '�ʹ� ���Ҿ��');
insert into board(num, pnum, name, email, pass, title, content)
values(board_seq.nextval, 0, '������', 'one@nate.com', '1234', '������', '���������� ���־��!');
select * from board;
select level, num, pnum, pass, name, email, LPAD(' ', 4*(level-1))||title title, content, readcount, writedate
from board start with pnum=0 connect by prior num=pnum order siblings by num desc;
commit;