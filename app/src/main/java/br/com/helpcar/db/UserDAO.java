package br.com.helpcar.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import br.com.helpcar.model.User;

@Dao
public interface UserDAO {
    @Insert
    void createUser(User user);

    @Query("SELECT * FROM User WHERE userId = 1")
    User getUser();

    @Update
    void updateUser(User user);
}