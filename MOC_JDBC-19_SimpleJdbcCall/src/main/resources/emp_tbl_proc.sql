CREATE OR REPLACE PROCEDURE emp_tbl_proc(
	   p_eno IN EMP_TBL.eno%TYPE,
	   p_name IN EMP_TBL.name%TYPE,
	   p_salary IN EMP_TBL.salary%TYPE)
IS
BEGIN

  INSERT INTO EMP_TBL
  VALUES (p_eno, p_name,p_salary);

  COMMIT;

END;
/