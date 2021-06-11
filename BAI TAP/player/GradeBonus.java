/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author GIA KINH
 */
public interface GradeBonus {
    public static final int GRADE_A_BONUS_PERCENT = 100;
    public static final int GRADE_B_BONUS_PERCENT = 50;
    public static final int GRADE_C_BONUS_PERCENT = 30;
    public static final int GRADE_D_BONUS_PERCENT = 10;
    public abstract double calculateGradeBonus();
}
