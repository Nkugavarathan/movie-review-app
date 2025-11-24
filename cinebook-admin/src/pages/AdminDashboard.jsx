import AdminSidebar from "../components/Sidebar"
import AdminHeader from "../components/Header"

export default function AdminDashboard() {
  return (
    <div className="flex">
      <AdminSidebar />

      <div className="flex-1 bg-[#F7F7F7] min-h-screen">
        <AdminHeader />

        <div className="p-6 grid grid-cols-1 sm:grid-cols-3 gap-6">
          <div className="p-6 bg-[#ECD5BC] rounded-xl shadow">
            <h3 className="text-xl font-bold">Movies</h3>
            <p className="text-gray-700 mt-2">Manage all Movies</p>
          </div>

          <div className="p-6 bg-[#C2E2FA] rounded-xl shadow">
            <h3 className="text-xl font-bold">Showtimes</h3>
            <p className="text-gray-700 mt-2">Manage Show Schedules</p>
          </div>

          <div className="p-6 bg-[#8CE4FF] rounded-xl shadow">
            <h3 className="text-xl font-bold">Bookings</h3>
            <p className="text-gray-700 mt-2">View All User Bookings</p>
          </div>
        </div>
      </div>
    </div>
  )
}
