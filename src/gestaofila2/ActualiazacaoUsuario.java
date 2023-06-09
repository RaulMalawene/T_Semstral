package gestaofila2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ActualiazacaoUsuario extends javax.swing.JFrame {

    public ActualiazacaoUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        codigoVer = new javax.swing.JLabel();
        GerarCode = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Apelido = new javax.swing.JTextField();
        UsuarioA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codigo = new javax.swing.JPasswordField();
        novaSenha = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tempo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel1.setFont(new java.awt.Font("MicroSquare", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Acessar dados");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel2.setFont(new java.awt.Font("MicroSquare", 1, 18)); // NOI18N
        jLabel2.setText("Acesso dos dados do Usuario");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        jButton2.setText("Acessar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        jLabel5.setText("Senha");

        codigoVer.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        codigoVer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        codigoVer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                codigoVerMouseMoved(evt);
            }
        });

        GerarCode.setBackground(new java.awt.Color(0, 0, 0));
        GerarCode.setFont(new java.awt.Font("MicroSquare", 1, 12)); // NOI18N
        GerarCode.setForeground(new java.awt.Color(51, 255, 51));
        GerarCode.setText("Gerar codigo");
        GerarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarCodeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        jLabel7.setText("Apelido");

        Apelido.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N

        UsuarioA.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        UsuarioA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel4.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        jLabel4.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        jLabel6.setText("Codigo");

        codigo.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N

        novaSenha.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        novaSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Apelido, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(UsuarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GerarCode)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigo))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigoVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GerarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Apelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(UsuarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(17, 17, 17))
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel22ComponentShown(evt);
            }
        });

        tempo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tempo.setForeground(new java.awt.Color(255, 255, 255));
        tempo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tempoComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(153, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(tempo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addGap(204, 204, 204)))
        );

        jButton3.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("MicroSquare", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Fechar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            FileReader open = new FileReader("Cadastro.txt");
            BufferedReader openning = new BufferedReader(open);
            ArrayList<Usuario> list = new ArrayList<Usuario>();
            
            String[] lista;
            String linha = openning.readLine();
            
            while(linha != null){
                 lista = linha.split(";");
                 
                 String nome = lista[0];
                 String apelido = lista[1];
                 String dataNascimento = lista[2];
                 String dataDesconhecida = lista[3];
                 String bi = lista[4];
                 String sexos = lista[5];
                 String celular = lista[6];
                 String email = lista[7];
                 String usuario = lista[8];
                 String senha = lista[9];
                 String senhaConf = lista[10];
                 list.add(new Usuario( nome, apelido,dataNascimento, celular, sexos,dataDesconhecida,bi,
                         email ,usuario,senha,senhaConf));
                 
                 linha = openning.readLine();
            }  
            //INSTANCIA
            VerificarCodigoGerado verificar = new VerificarCodigoGerado();
            String codigoGerado = verificar.getGerarCodigo();
            
            String codigoView = codigoVer.getText();
            String codigoTxtF = codigo.getText();
            
            //VALIDACAO DOS DADOS INSERIDOS    
        for(int x = 0; x <= list.size(); x++){
            Usuario validar = list.get(x);
            String usus = validar.getUsuario();
            String senha01 = validar.getSenha();
                        
           if(!codigoView.equals(codigoTxtF)){
                  JOptionPane.showMessageDialog(null, "CODIGO INCORRETO");
                  
           }else if(validar.getApelido().equals(Apelido.getText())){
                JOptionPane.showMessageDialog(null, "CONCLUIDO");
               
                UsuarioA.setText(usus);
                novaSenha.setText(senha01);
                
                codigoVer.setText("");
                codigo.setText("");
                Apelido.setText("");
                
                break;
            
           }else if(x == list.size() - 1){
                    JOptionPane.showMessageDialog(null, "ERRO"+"\n"+"TENTE NOVAMENTE!");
                    break;
           }
        }       
        }catch(Exception ex){
             Logger.getLogger(ActualiazacaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoginUsuario tela = new LoginUsuario();
        tela.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void codigoVerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoVerMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoVerMouseMoved

    public class VerificarCodigoGerado{
        private String gerarCodigo;
         
        public VerificarCodigoGerado() {
        }

        public VerificarCodigoGerado(String GerarCodigo) {
            this.gerarCodigo = (gerarCodigo);
        }
        public String getGerarCodigo() {
            return gerarCodigo;
        }

        public void setGerarCodigo(String GerarCodigo) {
            this.gerarCodigo = GerarCodigo;
        }

        @Override
        public String toString() {
            return "VerificarCodigoGerado{" + "GerarCodigo=" + gerarCodigo + '}';
        }    
   }
    private void GerarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarCodeActionPerformed
        // TODO add your handling code here:
        //GENERATING RANDOM CODES
        int cont = 2;
          
      //  while(cont >= 0){
            int limite = 100;      
            int limite1 = 100;
            int limite2 = 100;
            int limite3 = 26;
            int limite4 = 6;
            int limite5 = 26;
          
            String[] numeros = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20",
                    "21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40",
                    "41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60",
                    "61","06","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80",
                    "81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99","100"};
          
            String[] numero1 = {"101","102","103","104","105","106","107","108","109","110","111","412","113","114","115","116","617","118","619","120",
                    "121","122","123","124","125","126","127","428","129","130","131","132","133","134","135","136","137","138","139","140",
                    "141","142","143","144","145","146","147","148","149","150","151","152","153","154","155","456","157","158","159","160",
                    "161","106","163","164","165","166","167","168","169","870","171","972","173","174","175","176","177","178","179","180",
                    "181","182","183","184","185","186","187","188","189","190","191","192","193","194","195","196","197","398","199","200"};
               
            String[] numero2 = {"201","202","203","204","205","206","207","208","209","210","211","212","513","214","215","216","217","218","319","220",
                    "221","222","223","224","225","226","227","228","229","230","231","232","233","334","235","236","237","238","239","240",
                    "241","242","243","244","245","246","247","248","249","250","251","252","253","254","255","256","257","058","259","260",
                    "761","206","263","264","265","266","267","768","269","270","271","272","273","274","775","276","277","278","279","280",
                    "281","282","383","284","285","286","287","288","589","590","291","592","293","294","295","296","297","598","299","300"};
                
             String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
             
             String[] letras1 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
              
             String[] simbolos ={"*","%","#","@","!","?"};
             
             Random rand = new Random();
             String dez = numeros[rand.nextInt(limite)];
             String cem = numero1[rand.nextInt(limite1)];
             String duzentos = numero2[rand.nextInt(limite2)];
             String letters = letras[rand.nextInt(limite3)];
             String symbols = simbolos[rand.nextInt(limite4)];
             String letters1 = letras1[rand.nextInt(limite5)];
             
              String concat = letters + letters1 + dez + cem + duzentos + symbols; 
             
              VerificarCodigoGerado verificar = new VerificarCodigoGerado(concat);
              verificar.setGerarCodigo(concat);
              codigoVer.setText(concat);
         //    --cont;
      // }  
        
        
        // JOptionPane.showMessageDialog(null, "Limite");      
    }//GEN-LAST:event_GerarCodeActionPerformed

    private void jLabel22ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel22ComponentShown
        // TODO add your handling code here:

        Date data = new Date();
        tempo.setText(data.toString());
    }//GEN-LAST:event_jLabel22ComponentShown

    private void tempoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tempoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tempoComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apelido;
    private javax.swing.JButton GerarCode;
    private javax.swing.JLabel UsuarioA;
    private javax.swing.JPasswordField codigo;
    private javax.swing.JLabel codigoVer;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel novaSenha;
    private javax.swing.JLabel tempo;
    // End of variables declaration//GEN-END:variables
}
