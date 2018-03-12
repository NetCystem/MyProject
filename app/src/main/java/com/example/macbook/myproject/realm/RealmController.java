package com.example.macbook.myproject.realm;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.example.macbook.myproject.Model.Contact;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by MAcBook on 01/03/2018.
 */

public class RealmController {

    private static RealmController instance;
    private final Realm realm;




    public RealmController(Application application) {
        realm = Realm.getDefaultInstance();
    }

    public static RealmController with(Fragment fragment) {

        if (instance == null) {
            instance = new RealmController(fragment.getActivity().getApplication());
        }
        return instance;
    }

    public static RealmController with(Activity activity) {

        if (instance == null) {
            instance = new RealmController(activity.getApplication());
        }
        return instance;
    }

    public static RealmController with(Application application) {

        if (instance == null) {
            instance = new RealmController(application);
        }
        return instance;
    }

    public static RealmController getInstance() {

        return instance;
    }

    public Realm getRealm() {

        return realm;
    }

    //Refresh the realm istance
    public void refresh() {

        realm.refresh();
    }


    //clear all objects from Contact.class
//    public void clearAll() {
//
//        realm.beginTransaction();
//        realm.clear(Contact.class);
//        realm.commitTransaction();
//    }

    //find all objects in the Contact.class
    public RealmResults<Contact> getContacts() {

        return realm.where(Contact.class).findAll();
    }

    //query a single item with the given id
    public Contact getContact(String id) {

        return realm.where(Contact.class).equalTo("id", id).findFirst();
    }

    //check if Contact.class is empty
//    public boolean hasBooks() {
//
//        return !realm.allObjects(Contact.class).isEmpty();
//    }

    //query example
    public RealmResults<Contact> queryedContacts() {

        return realm.where(Contact.class)
                .contains("author", "Author 0")
                .or()
                .contains("title", "Realm")
                .findAll();

    }
}

