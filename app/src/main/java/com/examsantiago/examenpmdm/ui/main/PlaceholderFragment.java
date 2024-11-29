package com.examsantiago.examenpmdm.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.examsantiago.examenpmdm.R;
import com.examsantiago.examenpmdm.databinding.FragmentMainActivityFragmentsBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {
@NonNull
    @Override
    public  View onCreateView(@NonNull LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable Bundle savedIntanceState){
            return  inflater.inflate(R.layout.fragment1,container,false);
    }

}