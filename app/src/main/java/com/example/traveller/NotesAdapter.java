package com.example.traveller;

import android.provider.ContactsContract;
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {
//    private ArrayList<Note> notes;
//    private OnNoteClickListener onNoteClickListener;
//
//    public NotesAdapter(ArrayList<Note> notes) {
//        this.notes = notes;
//    }
//
//    public void setOnNoteClickListener(OnNoteClickListener onNoteClickListener) {
//        this.onNoteClickListener = onNoteClickListener;
//    }
//
//    interface OnNoteClickListener {
//        void onNoteClick(int position);
//        void onLongClick(int position);
//    }
//
//    @NonNull
//    @Override
//    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.note_items, viewGroup, false);
//        return new NotesViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull NotesViewHolder notesViewHolder, int i) {
//        Note note = notes.get(i);
//        notesViewHolder.textViewTitle.setText(note.getTitle());
//        notesViewHolder.textViewDescription.setText(note.getDescription());
//        notesViewHolder.textViewDayOfWeek.setText(note.getDayOfWeek());
//        int colorId;
//        int priority = note.getPriority();
//        switch (priority) {
//            case 1:
//                colorId = notesViewHolder.itemView.getResources().getColor(android.R.color.holo_red_light);
//                break;
//            case 2:
//                colorId = notesViewHolder.itemView.getResources().getColor(android.R.color.holo_orange_light);
//                break;
//            case 3:
//                colorId = notesViewHolder.itemView.getResources().getColor(android.R.color.holo_green_light);
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + priority);
//        }
//        notesViewHolder.textViewTitle.setBackgroundColor(colorId);
//    }
//
//    @Override
//    public int getItemCount() {
//        return notes.size();
//    }
//
//    class NotesViewHolder extends RecyclerView.ViewHolder {
//        private TextView textViewTitle;
//        private TextView textViewDescription;
//        private TextView textViewDayOfWeek;
//
//
//        public NotesViewHolder(@NonNull View itemView) {
//            super(itemView);
//            textViewTitle = itemView.findViewById(R.id.textViewTitle);
//            textViewDescription = itemView.findViewById(R.id.textViewDescription);
//            textViewDayOfWeek = itemView.findViewById(R.id.textViewDayOfWeek);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//            if (onNoteClickListener != null){
//                onNoteClickListener.onNoteClick(getAdapterPosition());
//                    }
//                }
//
//            });
//            itemView.setOnLongClickListener(new View.OnLongClickListener(){
//
//                @Override
//                public boolean onLongClick(View v) {
//                    if(onNoteClickListener != null){
//                        onNoteClickListener.onLongClick(getAdapterPosition());
//                    }
//                    return true;
//                }
//            });
//        }
//    }
//}

    private ArrayList<Note> notes;
    private OnNoteClickListener onNoteClickListener;

    public NotesAdapter(ArrayList<Note> notes) {
        this.notes = notes;
    }

    interface OnNoteClickListener {
        void onNoteClick(int position);
        void onLongClick(int position);
    }

    public void setOnNoteClickListener(OnNoteClickListener onNoteClickListener) {
        this.onNoteClickListener = onNoteClickListener;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.note_items, viewGroup, false);
        return new NotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder notesViewHolder, int i) {
        Note note = notes.get(i);
        notesViewHolder.textViewTitle.setText(note.getTitle());
        notesViewHolder.textViewDescription.setText(note.getDescription());
        notesViewHolder.textViewDayOfWeek.setText(Note.getDayAsString(note.getDayOfWeek()));
        int colorId;
        int priority = note.getPriority();
        switch (priority) {
            case 1:
                colorId = notesViewHolder.itemView.getResources().getColor(android.R.color.holo_red_light);
                break;
            case 2:
                colorId = notesViewHolder.itemView.getResources().getColor(android.R.color.holo_orange_light);
                break;
            default:
                colorId = notesViewHolder.itemView.getResources().getColor(android.R.color.holo_green_light);
                break;
        }
        notesViewHolder.textViewTitle.setBackgroundColor(colorId);
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    class NotesViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewTitle;
        private TextView textViewDescription;
        private TextView textViewDayOfWeek;

        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);
            textViewDayOfWeek = itemView.findViewById(R.id.textViewDayOfWeek);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onNoteClickListener != null) {
                        onNoteClickListener.onNoteClick(getAdapterPosition());
                    }
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if (onNoteClickListener != null) {
                        onNoteClickListener.onLongClick(getAdapterPosition());
                    }
                    return true;
                }
            });
        }
    }
}
