/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 * Classe que representa um elemento genérico no jogo Sokoban. Esta classe é
 * responsável por desenhar o elemento e carregar sua imagem.
 *
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class Element extends JComponent {

    protected Image myImg;

    private final static String path = "/sokoban/resources/theme/";
    protected static String theme = "main/";
    protected String imageName = null;

    protected Color myColor = Color.LIGHT_GRAY;

    /**
     * Construtor que inicializa um elemento com uma imagem específica.
     * 
     * @param imageName Nome da imagem a ser carregada para o elemento.
     */
    public Element(String imageName) {
        this.imageName = imageName;
        myImg = loadImage(imageName);
    }
    
    /**
     * Construtor padrão que inicializa um elemento com a imagem "teleport.png".
     */
    public Element() {
        this("teleport.png");
    }

    /**
     * Método responsável por desenhar o elemento.
     * 
     * @param gr Objeto Graphics usado para desenhar o elemento.
     * @param px Coordenada x do elemento.
     * @param py Coordenada y do elemento.
     * @param width Largura do elemento.
     * @param height Altura do elemento.
     */
    public void draw(Graphics gr, int px, int py, int width, int height) {
        if (myImg != null) {
            gr.drawImage(myImg, px * width, py * height, width, height, null);
        }
    }

    /**
     * Método chamado para pintar o componente.
     * 
     * @param gr Objeto Graphics usado para desenhar o componente.
     */
    @Override
    public void paintComponent(Graphics gr) {
        draw(gr, 0, 0, getWidth(), getHeight());
    }

    /**
     * Obtém a imagem do elemento.
     * 
     * @return Imagem do elemento.
     */
    public Image getMyImg() {
        return myImg;
    }

    /**
     * Define uma nova imagem para o elemento.
     * 
     * @param myImg Nova imagem para o elemento.
     */
    public void setMyImg(Image myImg) {
        this.myImg = myImg;
    }

    /**
     * Lê uma imagem de um recurso
     *
     * @autor Professor António Manso
     *
     * @param resourceName
     * @return imagem ou null se o recurso não existir
     */
    public final Image loadImage(String resourceName) {
        //colocar a path na imagem
        resourceName = path + theme + resourceName;
        try {
            //input stream para o recurso
            InputStream in = getClass().getResourceAsStream(resourceName);
            //ler a imagem e retornar o objeto
            return ImageIO.read(in);
        } catch (IOException ex) {
            return null;
        }
    }
}
