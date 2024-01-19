// �P��02 ��o�ۑ�1 �𓚗�
// ���̓`�F�b�N�@�\�t����FizzBuzz��@�v���O����
class FizzBuzz1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("�o�͔͈͂��w�肵�Ă�������");
            System.exit(1);
        }
        int end = 0;
        try {
            end = Integer.parseInt(args[0]);
        } catch(NumberFormatException e) {
            System.out.println("�o�͔͈͂͐����Ŏw�肵�Ă�������");
            System.exit(1);
        }
        if (end < 5) {
            System.out.println("�o�͔͈͂�5�ȏ�̐����Ŏw�肵�Ă�������");
            System.exit(1);
        }
        for (int i = 1; i <= end; ++i) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz,");
            } else if (i % 5 == 0) {
                System.out.print("Buzz,");
            } else if (i % 3 == 0) {
                System.out.print("Fizz,");
            } else {
                System.out.print(i + ",");
            }
        }
    }
}
