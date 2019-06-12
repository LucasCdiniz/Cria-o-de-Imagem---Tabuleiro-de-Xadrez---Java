// CRIADO E DESENVOLVIDO POR:
// LUCAS CELESTINO DINIZ
// lucascelestino.diniz@gmail.com
/*
    Aplicação que realiza a criação de uma imagem
    A imagem de um tabuleiro de Xadrez
    Aqui pelo código é possível alterar as cores dos quadrados
*/


package criandoimagemcg;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class CriandoImagemCG {

    
    public static void main(String[] args) throws IOException{
        int largura = 256;
        int altura = 256;
        
        BufferedImage imagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = imagem.getRaster();
        
        int[] cor1 = new int [] {101,0,67}; // alteração das cores RGB
        int[] cor2 = new int [] {26,0,3}; // alteração das cores RGB
        
        int cot = 0;
        for(int a=0;a<altura;a++)
            for(int l=0;l<largura;l++){
                if((((l/32)+(a/32))%2) == 0)
                    raster.setPixel(l, a, cor1);
                else raster.setPixel(l, a,cor2);
            }
        ImageIO.write(imagem, "PNG", new File("xadrez.png"));
    }
    
}
