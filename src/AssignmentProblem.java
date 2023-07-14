import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rhabi Mendoza
 */

public class AssignmentProblem extends javax.swing.JFrame {

    public AssignmentProblem() {
        
        // Frame components
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        rbtnAll = new javax.swing.JRadioButton();
        rbtnLast = new javax.swing.JRadioButton();
        btnSolve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtInput.setColumns(20);
        txtInput.setFont(new java.awt.Font("Dialog", 0, 19)); // NOI18N
        txtInput.setRows(5);
        txtInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 73, 214)));
        jScrollPane1.setViewportView(txtInput);

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        txtOutput.setRows(5);
        txtOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 73, 214)));
        jScrollPane2.setViewportView(txtOutput);

        btnClear.setBackground(new java.awt.Color(0, 73, 214));
        btnClear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblMinimize.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(0, 73, 214));
        lblMinimize.setText("-");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblClose.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblClose.setForeground(new java.awt.Color(0, 73, 214));
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        rbtnGroup.add(rbtnAll);
        rbtnAll.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbtnAll.setForeground(new java.awt.Color(0, 73, 214));
        rbtnAll.setText("All");

        rbtnGroup.add(rbtnLast);
        rbtnLast.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbtnLast.setForeground(new java.awt.Color(0, 73, 214));
        rbtnLast.setText("Last");

        btnSolve.setBackground(new java.awt.Color(0, 73, 214));
        btnSolve.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSolve.setForeground(new java.awt.Color(255, 255, 255));
        btnSolve.setText("Solve");
        btnSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnLast)
                                .addGap(9, 9, 9))
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSolve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClose)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtnAll)
                                    .addComponent(rbtnLast))
                                .addGap(18, 18, 18)
                                .addComponent(btnSolve))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblClose)
                                    .addComponent(lblMinimize))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        // Clear inputs and outputs
        txtInput.setText("");
        txtOutput.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolveActionPerformed
        
        // Create variables for storing numbers and outputs
        int given[][] = new int[6][6];
        String all = "", last = "";
        int sum = 0;
 
        // Get typed input
        String inp = txtInput.getText() + "";
        
        // Check if input is empty
        if(inp.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input given to solve!");
            return;
        }
        
        // Check if there is no selected radiobutton
        if(rbtnAll.isSelected() == false && rbtnLast.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Please choose what to output in radio buttons!");
            return;
        }
        
        // Check if the input is 6 by 6 and are all numeric
        try{
            
            // Check if the input is six lines
            String lines[] = inp.split("\\n");
            if(lines.length != 6){
                JOptionPane.showMessageDialog(null, "Input should be 6 by 6!");
                return;
            }
            
            // Iterate through all lines of input
            for(int ctr = 0; ctr < 6; ctr++){
                
                // Check if a line of input has 6 numbers input
                String nums[] = lines[ctr].split("\\s+");
                if(nums.length != 6){
                    JOptionPane.showMessageDialog(null, "Input should be 6 by 6!");
                    return;
                }
                
                // Parse all input to integer
                for(int ctr2 = 0; ctr2 < 6; ctr2++){
                    given[ctr][ctr2] = Integer.parseInt(nums[ctr2]);
                }
            }  
        }
        
        // Show error if value form input is not numeric
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Input should be numeric values only!");
        }
        
        // Assignment problem using backtracking algorithm
        for(int a = 1; a <= 6; a++){
            sum = given[0][a-1];
            System.out.println("A" + a + " = " + sum);
            all += ("A" + a + " = " + sum) + "\n";

            for(int b = 1; b <= 6; b++){
                if(a != b){
                    sum = given[0][a-1] + given[1][b-1];
                    all += ("A" + a + "B" + b + " = " + sum) + "\n";

                    for(int c = 1; c <= 6; c++){
                        if(a != c && b != c){
                            sum = given[0][a-1] + given[1][b-1] + given[2][c-1];
                            all += ("A" + a + "B" + b + "C" + c + " = " + sum) + "\n";

                            for(int d = 1; d <= 6; d++){
                                if(a != d && b != d && c != d){
                                    sum = given[0][a-1] + given[1][b-1] + given[2][c-1] + given[3][d-1];
                                    all += ("A" + a + "B" + b + "C" + c + "D" + d + " = " + sum) + "\n";

                                    for(int e = 1; e <= 6; e++){
                                        if(a != e && b != e && c != e && d != e){
                                            sum = given[0][a-1] + given[1][b-1] + given[2][c-1] + given[3][d-1] + given[4][e-1];
                                            all += ("A" + a + "B" + b + "C" + c + "D" + d + "E" + e + " = " + sum) + "\n";

                                            for(int f = 1; f <= 6; f++){
                                                if(a != f && b != f && c != f && d != f && e != f){
                                                    sum = given[0][a-1] + given[1][b-1] + given[2][c-1] + given[3][d-1] + given[4][e-1] + given[5][f-1];
                                                    all += ("A" + a + "B" + b + "C" + c + "D" + d + "E" + e + "F" + f + " = " + sum) + "\n";
                                                    last += ("A" + a + "B" + b + "C" + c + "D" + d + "E" + e + "F" + f + " = " + sum) + "\n";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }   
            }
        }
        
        // Output based on selected radiobutton
        if(rbtnAll.isSelected()){
            txtOutput.setText(all);
        }
        if(rbtnLast.isSelected()){
            txtOutput.setText(last);
        }
    }//GEN-LAST:event_btnSolveActionPerformed

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        
        // Minimize the frame
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        
        // Close the frame
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentProblem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSolve;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JRadioButton rbtnAll;
    private javax.swing.ButtonGroup rbtnGroup;
    private javax.swing.JRadioButton rbtnLast;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}