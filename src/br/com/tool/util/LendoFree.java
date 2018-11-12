/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tool.util;

import br.com.tool.modal.FreeDuel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Matheus
 */
public abstract class LendoFree extends FreeDuel {

    public static byte[] campos(int proxDuelista) throws FileNotFoundException, IOException {
        RandomAccessFile slus = null;
        byte[] buf = null;

        slus = new RandomAccessFile(FreeDuel.getFreeDuel(), "r");
        buf = new byte[1];
        slus.seek(hexPerson(proxDuelista));
        slus.read(buf);
        slus.close();
        return buf;
    }

    //retorna o offset do personagem
    private static int hexPerson(int numero) {
        int hexbuf = 0;
        switch (numero) {
            case 0://SIMON MURAN 
                hexbuf = (0x1a1fa6 + 0x5);
                break;
            case 1://TEANA
                hexbuf = (0x1a2db2 + 0x5);
                break;
            case 2://JONO
                hexbuf = (0x0462a8 + 0x5);
                break;
            case 3://VILLAGER 1
                hexbuf = (0x1a2eb5 + 0x5);
                break;
            case 4://VILLAGER 2
                hexbuf = (0x1a2f4e + 0x5);
                break;
            case 5://VILLAGER 3
                hexbuf = (0x1a3000 + 0x5);
                break;
            case 6://SETO
                hexbuf = (0x1a355b + 0x5);
                break;
            case 7://HEISHIN
                hexbuf = (0x1a5964 + 0x5);
                break;
            case 8://REX RAPTOR
                hexbuf = (0x1a65fa + 0x5);
                break;
            case 9://WEEVIL UNDERWOOD
                hexbuf = (0x1a6777 + 0x5);
                break;
            case 10://MAI VALENTINE
                hexbuf = (0x1a6905 + 0x5);
            case 11://BANDIT KEITH
                hexbuf = (0x1a6a5c + 0x5);
                break;
            case 12://SHADI
                hexbuf = (0x1a773c + 0x5);
                break;
            case 13://YAMI BAKURA
                hexbuf = (0x1a7a78 + 0x5);
                break;
            case 14://PEGASUS
                hexbuf = (0x1a7b72 + 0x5);
                break;
            case 15://ISIS 
                hexbuf = (0x1a7913 + 0x5);
                break;
            case 16://KAIBA
                hexbuf = (0x1a75a0 + 0x5);
                break;
            case 17://MAGE SOLDIER
                hexbuf = (0x1a875d + 0x5);
                break;
            case 18://JONO 2ND
                hexbuf = (0x1aabe4 + 0x5);
                break;
            case 19://TEANA 2ND
                hexbuf = (0x1aac07 + 0x5);
                break;
            case 20://OCEAN MAGE
                hexbuf = (0x1ad2ef + 0x5);
                break;
            case 21://HIGH MAGE SECMETON
                hexbuf = (0x1ad5d1 + 0x5);
            case 22://FOREST MAGE 
                hexbuf = (0x1ad780 + 0x5);
                break;
            case 23://HIGH MAGE ANUBISIUS
                hexbuf = (0x1adadc + 0x5);
                break;
            case 24://MOUNTAIN MAGE
                hexbuf = (0x1adc80 + 0x5);
                break;
            case 25://HIGH MAGE ATENZA 
                hexbuf = (0x1adf05 + 0x5);
                break;
            case 26://DESERT MAGE
                hexbuf = (0x1ae0c6 + 0x5);
                break;
            case 27://HIGH MAGE MARTIS
                hexbuf = (0x1ae34a + 0x5);
                break;
            case 28://MEADOW MAGE
                hexbuf = (0x1ae4b5 + 0x5);
            case 29://HIGH MAGE KEPURA
                hexbuf = (0x1ae7f9 + 0x5);
                break;
            case 30://LABYRINTH MAGE
                hexbuf = (0x1ac091 + 0x5);
            case 31://SETO 2ND
                hexbuf = (0x1acaa0 + 0x5);
                break;
            case 32://GUARDIAN SEBEK
                hexbuf = (0x1aeaac + 0x5);
                break;
            case 33://GUARDIAN NEKU
                hexbuf = (0x1aebb8 + 0x5);
                break;
            case 34://HEISHIN 2ND
                hexbuf = (0x1aed07 + 0x5);
                break;
            case 35://SETO 3RD
                hexbuf = (0x1af345 + 0x5);
                break;
            case 36://DARKNITE
                hexbuf = (0x1af8ad + 0x5);
                break;
            case 37://NITEMARE
                hexbuf = (0x1b00cf + 0x5);
        }
        return hexbuf;
    }

}
