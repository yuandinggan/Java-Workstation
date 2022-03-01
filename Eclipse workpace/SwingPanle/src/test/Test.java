package test;

import javax.swing.*;

public class Test {

	public static void main(String[] args) {
		JFrame jFrame=new JFrame();
		jFrame.setSize(400,500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Test");//创建按钮
		button.setSize(200, 150);//设置大小
		button.setLocation(100, 450);//设置位置
		
		JPanel jPanle=new JPanel();
		jPanle.add(new JLabel("测试一下"));
		jPanle.add(button);		
		jFrame.setContentPane(jPanle);
		jFrame.setVisible(true);

	}

}
