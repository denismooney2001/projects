/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

/**
 *
 * @author denis
 */
public interface TimetableCancellationsDaoInterface {

    public boolean insertCancelDate(int timetable_id, String cancelDate);
}
