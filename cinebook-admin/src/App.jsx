import { BrowserRouter, Routes, Route } from "react-router-dom"
import AdminDashboard from "./pages/AdminDashboard"
import ProtectedAdminRoute from "./ProtectedAdminRoute"

export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        {/* Admin Dashboard */}
        <Routes
          path="/admin/dashboard"
          element={
            <ProtectedAdminRoute>
              <AdminDashboard />
            </ProtectedAdminRoute>
          }
        />
      </Routes>
    </BrowserRouter>
  )
}
