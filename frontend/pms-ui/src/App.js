import React from 'react';
import Home from './home';
import Login from './login';
import Track from './track';
import Book from './book';
import Pdupdate from './pickupdropupdate';
import Dsupdate from './deliverystateupdate';
import Bookings from './bookings';
import { BrowserRouter as Router, Routes,Route } from 'react-router-dom';

function App() {
  return (
    <Router>
      <div>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/login" element={<Login />} />
          <Route path="/track" element={<Track />} />
          <Route path="/book" element={<Book />} />
          <Route path="/pickDropUpdate" element={<Pdupdate />} />
          <Route path="/deliveryStatusUpdate" element={<Dsupdate />} />
          <Route path="/bookingHistory" element={<Bookings />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
