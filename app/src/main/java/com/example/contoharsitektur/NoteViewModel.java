package com.example.contoharsitektur;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private NoteReporitory reporitory;
    private LiveData<List<Note>> allNotes;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        reporitory = new NoteReporitory(application);
        allNotes = reporitory.getAllNotes();
    }

    public void insert(Note note){
        reporitory.insert(note);
    }

    public void update(Note note){
        reporitory.update(note);
    }

    public void delete(Note note){
        reporitory.delete(note);
    }

    public  void deleteAllNotes(){
        reporitory.deleteAllNotes();
    }

    public LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }
}
