/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

/**
 * Classe utilitária para carregar e controlar sons no jogo Sokoban.
 * 
 * @autor Tiago Paiva
 * @autor Mário Bonacho
 */
public class SokobanSons {

    /**
     * Carrega um arquivo de som e retorna um objeto Clip que pode ser reproduzido.
     * 
     * @param ficheiro O caminho para o arquivo de som.
     * @return Um objeto Clip que contém o som carregado, ou null se ocorrer um erro.
     */
    public static Clip carregarSom(String ficheiro) {
        try {
            AudioInputStream musica = AudioSystem.getAudioInputStream(new File(ficheiro));

            Clip music = AudioSystem.getClip();
            music.open(musica);
            return music;
        } catch (Exception ex) {
            Logger.getLogger(SokobanSons.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Define o volume de um objeto Clip.
     * 
     * @autor Professor António Manso.
     * 
     * @param clip O objeto Clip cujo volume será ajustado.
     * @param volume O novo volume desejado, onde 1.0 é o volume máximo e 0.0 é o volume mínimo.
     */
    public static void setVolume(Clip clip, double volume) {
        // Obtém o controle de ganho do clipe
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

        // Calcula o valor em decibéis para o volume desejado
        double dB = 20 * Math.log10(volume);

        // Define o ganho do clipe
        gainControl.setValue((float) dB);
    }

}
