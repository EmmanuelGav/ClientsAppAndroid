package com.example.clientesapp.adapter.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.clientesapp.R;
import com.example.clientesapp.models.Client;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private List<Client> clients;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView name;
        private final TextView lastName;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            name = (TextView) view.findViewById(R.id.clientName);
            lastName = (TextView) view.findViewById(R.id.clientLastName);
        }

        public TextView getName() {
            return name;
        }
        public TextView getLastName() {
            return lastName;
        }
    }
    /**
     * Initialize the dataset of the Adapter.
     *
     * @param clients String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public HomeAdapter(List<Client> clients) {
        this.clients = clients;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_client, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getName().setText(clients.get(position).getName());
        viewHolder.getLastName().setText(clients.get(position).getLastName());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return clients.size();
    }
}
