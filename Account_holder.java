package bank.chennai;
class Account_holder
{
public static void main(String args[])
{
SBI sbi=new SBI();
sbi.emp_name="Nandhini";
sbi.emp_id=1233;
sbi.create_account();
sbi.get_loan(50000);
System.out.println(SBI.branch_name);
System.out.println( sbi.emp_name);
System.out.println(sbi.emp_id);

}
}